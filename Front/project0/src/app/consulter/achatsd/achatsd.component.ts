import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Achatsd } from 'src/app/model/achatsd.model';
import { AchatsdService } from 'src/app/services/achatsd.service';
import { AchatsdM } from './achatsd-m.model';
import { AchatsdMService } from 'src/app/services/achatsd-m.service';
import { Achatsdlast } from './achatsdlast.model';
import { AuthService } from 'src/app/services/auth.service';
import { MenuItem } from 'primeng/api';



@Component({
  selector: 'app-achatsd',
  templateUrl: './achatsd.component.html',
  styleUrls: ['./achatsd.component.css']
})


export class AchatsdComponent implements OnInit {
              achatsd! : Achatsd[];
              products!: Achatsd[];
              detail!: Achatsdlast[];
              libelle!: string;
              items!: MenuItem[];

            
              
  constructor(private achatsdService : AchatsdService, private achatsdMService : AchatsdMService,
             private router :Router,
             public authService: AuthService) {
             // this.route.queryParams.subscribe((params: { [x: string]: string; }) => {
              //  this.libelle = params['لوازم إستعمالات إدارية'];
                //L'attribut prenom contient "Jean"
              
            //});
              } 
              
          



  ngOnInit() {

 

   // this.libelle = this.route.snapshot.paramMap.get('prenom');

   this.achatsdService.listeAchatsd().subscribe(achCumule => {
    // console.log(ach,"1");
     this.products = achCumule;
     console.log(this.products,"1products");      
     });


    //this.achatsdMService.listeAchatsdM().subscribe(ach => {
     // console.log(ach,"1");
    //  this.achatsd = ach;
    //});
  
    }
 buttonclick (event : any ,  ntc : string) {
    this.achatsdMService.listeAchatsdM(ntc).subscribe(achDetail => {
      // console.log(ach,"1");
      this.achatsd = achDetail;
      // console.log(this.achatsd,"2");  
      console.log(this.achatsd,"2");    
       });

  }}
    

  
      /*this.achatsd=[
      {
        ur: "22",
        numPc: "22202000853",
        dtReal: new Date("15012020"),
        montant: 148,
        ntx: "AS",
        ntc: "851",
        libelle: "لوازم مرتبطة بالإنتاج"
        },
        {
          ur: "22",
          numPc: "22202000853",
          dtReal: new Date("15012020"),
          montant: 148,
          ntx: "AS",
          ntc: "851",
          libelle: "لوازم مرتبطة بالإنتاج"
          },
          {
            ur: "22",
            numPc: "22202000853",
            dtReal: new Date("15012020"),
            montant: 148,
            ntx: "AS",
            ntc: "851",
            libelle: "لوازم مرتبطة بالإنتاج"
            },];
            console.log(this.achatsd,"1achasd"); 
      });*/

     
     
      
     


     /* this.achatsdService.listeAchatsd().subscribe(ach => {
        console.log(ach);
        var newAch:AchatsdM[]=[];
        ach.map((value,index,self)=>{
          if (! self.find(v=>v.libelle===value.libelle))
         { newAch.push({
            montantTotal:0,
            ntx:value.ntx,
            ntc:value.ntc,
            libelle:value.libelle,
            montants:[]
          })
        console.log(value);
        }
          return;
        })
        console.log(newAch);
        }); */

    //  this.achatsdService.listeAchatsd().subscribe(data => this.products = data); */
    
      