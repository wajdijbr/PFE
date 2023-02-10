import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ɵInternalFormsSharedModule } from '@angular/forms';
import { Data } from '@angular/router';
import { ChartType } from 'chart.js';
import { MenuItem } from 'primeng/api';
import { Subscription } from 'rxjs';
import { CaisseService } from 'src/app/caisse.service';
import { Caisse } from 'src/app/model/caisse.model';
import { Soldes } from 'src/app/model/soldes.model';
import { AuthService } from 'src/app/services/auth.service';
import { SoldesService } from 'src/app/services/soldes.service';
import { CaisseComponent } from '../caisse/caisse.component';


@Component({
  selector: 'app-soldes',
  templateUrl: './soldes.component.html',

})

export class SoldesComponent implements OnInit{



  //data: { labels: Caisse[]; datasets: { label: string; data: Soldes[]; }[]; };
  data : any;
  caisses: Caisse[]=[];
  solde: Soldes[] = [];
  soldess! : Soldes[];
  caisseService!: CaisseService;
  labels:string[]=[];
  values:number[]=[];
 // dataLoaded=false;
  basicData:any;
  items!: MenuItem[];

  
  
 // sold!:number;
  //libCaisse!: string;
  //soldess! : Soldes[];





 constructor(private soldesService : SoldesService,public authService: AuthService,) {   
  }
  /*
ngOnInit(): void {
  this.soldesService.getSoldes().subscribe((so: Soldes[]) => {
  console.log(so);
  this.soldess = so;
  });
  }*/


 



  ngOnInit() {


  


   this.soldesService.listeSoldes().subscribe(
      datax=> {
        this.solde=datax;
        datax.forEach(res=>{
            this.labels.push(res['libCaisse']);
            this.values.push(res['solde']);
        });
      },()=>{},
      ()=> {
        this.data={
          labels: this.labels,
          datasets:[
            {
              label: 'soldes',
              backgroundColor: '#42A5F5',
              data:this.values
            }
          ]
        };
      //  this.dataLoaded=true;
      }
    );

    
 

        }}