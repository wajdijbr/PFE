import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {RouterModule, Routes} from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent }   from './app.component';

import { MenubarModule } from 'primeng/menubar';
import { InputTextModule } from 'primeng/inputtext';
 import { CaisseComponent } from './suivi/caisse/caisse.component';
import { SoldesComponent } from './suivi/soldes/soldes.component';
import { JournauxComponent } from './suivi/journaux/journaux.component';
import { SecoursComponent } from './consulter/secours/secours.component';
import { AvancesComponent } from './consulter/avances/avances/avances.component';
import { AchatsdComponent } from './consulter/achatsd/achatsd.component';
import{AppRoutingModule} from './app-routing.module';
import {MenuItem} from 'primeng/api';   
import{TableModule} from 'primeng/table';
import {ChartModule} from 'primeng/chart';
import {DropdownModule} from 'primeng/dropdown';
import {CalendarModule} from 'primeng/calendar';
import {RatingModule} from 'primeng/rating';






import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login/login.component';
import {enableProdMode} from '@angular/core';
import { ButtonModule } from 'primeng/button';
import { FormsModule } from '@angular/forms';
import { MenuComponent } from './menu/menu.component';
import {ProgressSpinnerModule} from 'primeng/progressspinner';
import { NgImageSliderModule } from 'ng-image-slider';
import { BienvComponent } from './bienv/bienv.component';





const appRoutes: Routes = [
  {path : "caisse" , component:CaisseComponent},
  {path : "soldes", component : SoldesComponent},
  {path : "journaux" , component : JournauxComponent},
  {path : "achatsd" , component:AchatsdComponent},
  {path : "secours" , component:SecoursComponent},
  {path : "avances" , component:AvancesComponent},
  {path: "login", component: LoginComponent},
  {path: "menu", component: MenuComponent},
  {path: "bienv", component: BienvComponent}

   //{ path: "", redirectTo: "login", pathMatch: "full" }

 
 
  ]
@NgModule({
  imports: [
    BrowserModule,ChartModule,DropdownModule,CalendarModule,RatingModule,ProgressSpinnerModule,NgImageSliderModule,
    BrowserAnimationsModule,
    MenubarModule,
    InputTextModule,
    RouterModule.forRoot(appRoutes),
    ButtonModule,
    AppRoutingModule,TableModule,HttpClientModule,FormsModule

  ],
  declarations: [ AppComponent,CaisseComponent,LoginComponent,
     SoldesComponent,
      JournauxComponent,
    BienvComponent,
        SecoursComponent,
         AvancesComponent,
          AchatsdComponent,
          MenuComponent,
          BienvComponent
           ],
           
  bootstrap:    [ AppComponent ]
  
 
})

export class AppModule { }
