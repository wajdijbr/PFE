import { Component, NgModule, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/model/login.model';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styles:[ ]
})
export class LoginComponent implements OnInit {
  user = new  Login;
  erreur=0;
  image :string="assets/images/cpg.jpg";



  constructor(private authService : AuthService,
    private router: Router) { }

  ngOnInit() {
  }

  onLoggedin()
{
console.log(this.user);
let isValidUser: Boolean = this.authService.SignIn(this.user);
if (isValidUser)
this.router.navigate(['/bienv']);
else
//alert('Login ou mot de passe incorrecte!');
this.erreur = 1;

}

}
