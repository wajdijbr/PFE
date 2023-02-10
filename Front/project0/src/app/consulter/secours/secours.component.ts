import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { SecoursNtc } from 'src/app/model/secours-ntc.model';
import { Secours } from 'src/app/model/secours.model';
import { AuthService } from 'src/app/services/auth.service';
import { SecoursNtcService } from 'src/app/services/secours-ntc.service';
import { SecoursService } from 'src/app/services/secours.service';



@Component({
  selector: 'app-secours',
  templateUrl: './secours.component.html',
  styleUrls: ['./secours.component.css']
})
export class SecoursComponent implements OnInit {
  secours!: Secours[];
  secoursNtc!: SecoursNtc[];
  items!: MenuItem[];



  constructor(private secoursService : SecoursService,private secoursNtcService : SecoursNtcService, 
    private router :Router,
    public authService: AuthService) { }

  ngOnInit() {

   
    this.secoursService.listeSecours().subscribe(sc => {
      // console.log(ach,"1");
       this.secours = sc;
       console.log(this.secours,"1");      
       });
  }
  buttonclick (event : any ,  ntc : string) {
    this.secoursNtcService.listeSecoursNtc(ntc).subscribe(scNtc => {
      // console.log(ach,"1");
      this.secoursNtc = scNtc;
      // console.log(this.achatsd,"2");  
      console.log(this.secoursNtc,"3");    
       });


      }}
