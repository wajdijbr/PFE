import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { JournauxService } from 'src/app/journaux.service';
import { Journaux } from 'src/app/model/journaux.model';
import { AuthService } from 'src/app/services/auth.service';



@Component({
  selector: 'app-journaux',
  templateUrl: './journaux.component.html',

})
export class JournauxComponent implements OnInit {
 

  
  journaux! : Journaux[];
  items!: MenuItem[];


  constructor(private journauxService : JournauxService,public authService: AuthService,
             private router :Router) { 

  // this.journaux = journauxService.listeJournaux();
    
  }
ngOnInit(): void {
 

  
  this.journauxService.listeJournaux().subscribe((j) => {
  console.log(j);
  this.journaux = j;
  });
  }}