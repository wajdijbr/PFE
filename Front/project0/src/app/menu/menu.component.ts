import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  items!: MenuItem[];
  profile: any;
  constructor (public authService: AuthService) {}


  ngOnInit() {
      this.items = [
          {
              label:'Suivre',
              icon:'pi pi-sliders-v',
              items:[
                  {
                      label:'Caisse', 
                      icon:'pi pi-dollar',
                     routerLink:['/caisse']
                     
                  },
                  {
                      label:'Soldes',
                      icon:'pi pi-wallet',
                      routerLink:['/soldes']

                  },
                  {
                      label:'journaux',
                     icon:'pi pi-book',
                     routerLink:['/journaux']
                  }
                 
                  
              
              ]
          },
          {
              label:'Consulter',
              icon:'pi pi-sliders-v',
              items:[
                  {
                      label:'Achats directs', icon:'pi pi-angle-right',routerLink:['/achatsd']
                      
                  },
                  {
                      label:'secours', icon:'pi pi-angle-right',routerLink:['/secours']
                  },
                  {
                      label:'Avances', icon:'pi pi-angle-right',routerLink:['/avances']
                      
                  }
                  

              ]
          },
          
                      
                  
          
         
                  
          
                     
                      
                  
              
         
         
      ];
  } 
}