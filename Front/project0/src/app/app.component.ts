import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {MenuItem} from 'primeng/api';
import{AppRoutingModule} from './app-routing.module';
import { AuthService } from './services/auth.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit{
  title='Sivi et Consulter caisses CPG';

  constructor(public authService: AuthService,
              public router : Router){}

  ngOnInit () {
    // let isloggedin: string;
    // let loggedUser:string;
    let isloggedin = localStorage.getItem('isloggedIn');
   let  loggedUser = localStorage.getItem('loggedUser');
    if (isloggedin!="true" || !loggedUser)
    this.router.navigate(['/login']);
    else
    this.authService.setLoggedUserFromLocalStorage(loggedUser);
    }
 
  
}   
