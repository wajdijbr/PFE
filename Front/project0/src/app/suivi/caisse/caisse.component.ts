import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { CaisseService } from 'src/app/caisse.service';
import { Caisse } from 'src/app/model/caisse.model';
import { AuthService } from 'src/app/services/auth.service';


@Component({
  selector: 'app-caisse',
  templateUrl: './caisse.component.html',

})
export class CaisseComponent implements OnInit {
 
  data : any;
  caisses: Caisse[]=[];
  Caisse! : Caisse[];
  labels:string[]=[];
  values:number[]=[];
 // dataLoaded=false;
  basicData:any;
  items!: MenuItem[];

  
 
  constructor(private caisseService : CaisseService,
    public authService: AuthService,
             private router :Router) { 

   //this.produits = produitService.listeProduit();
    
  }
ngOnInit() {


 
    
               
                
            
        
   
   

   this.caisseService.listeCaisse().subscribe(
      datax=> {
        console.log(datax);

        const colors = ['#42A5F5', 'green', 'yellow', 'red', 'blue', 'pink','gray','black']
        
        const labels = datax.map(elem => elem.dateJournee).filter((value, index, self)=> {
          return self.indexOf(value) === index;
        })

        console.log(labels)

        const libelle =  datax.map(elem => elem.libCaisse).filter((value, index, self)=> {
          return self.indexOf(value) === index;
        })

        console.log(libelle)

        const datasets = libelle.map((lib, index) => ({
          label: lib,
          data: datax.filter(data => data.libCaisse !== lib).map(elem => elem.soldeVeille).slice(0, libelle.length),
          fill: false,
          borderColor: colors[index%colors.length]
        }))

        console.log(datasets)
        this.basicData = {  
          labels,
          datasets
      }
      console.log(this.data)
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




  }
}