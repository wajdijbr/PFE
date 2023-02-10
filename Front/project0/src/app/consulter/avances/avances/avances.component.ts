import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { AvancesNtc } from 'src/app/model/avances-ntc.model';
import { Avances } from 'src/app/model/avances.model';
import { AuthService } from 'src/app/services/auth.service';
import { AvancesNtcService } from 'src/app/services/avances-ntc.service';
import { AvancesService } from 'src/app/services/avances.service';

@Component({
  selector: 'app-avances',
  templateUrl: './avances.component.html',
  styleUrls: ['./avances.component.css']
})
export class AvancesComponent implements OnInit {
avances !: Avances[];
avancesNtc !: AvancesNtc[];
items!: MenuItem[];

  
  constructor(private avancesService : AvancesService,private avancesNtcService : AvancesNtcService, 
    private router :Router,
    public authService: AuthService) { }

  ngOnInit(){

    this.avancesService.listeAvances().subscribe(av => {
      // console.log(ach,"1");
       this.avances = av;
       console.log(this.avances,"1");      
       });
  }
  buttonclick (event : any ,  ntc : string) {
    this.avancesNtcService.listeAvancesNtc(ntc).subscribe(avNtc => {
      // console.log(ach,"1");
      this.avancesNtc = avNtc;
      // console.log(this.achatsd,"2");  
      console.log(this.avancesNtc,"3");    
       });

  }

}
