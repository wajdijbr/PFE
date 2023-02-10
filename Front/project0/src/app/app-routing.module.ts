import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import {ChartModule} from 'primeng/chart';
import {Chart} from 'chart.js';
import {DropdownModule} from 'primeng/dropdown';




const routes : Routes = [];
@NgModule({
    imports: [
        RouterModule.forRoot(routes),ChartModule,DropdownModule,
       
    ],
    exports: [RouterModule,ChartModule]
})
export class AppRoutingModule {}