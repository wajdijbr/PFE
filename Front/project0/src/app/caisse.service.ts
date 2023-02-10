import { Injectable } from '@angular/core';
import { Caisse } from './model/caisse.model';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
  };
  @Injectable({
    providedIn: 'root'
  })  

export class CaisseService {
  //un tableau de Produit
 //un tableau de Produit
 caisses! : Caisse[];
apiURL: string = 'http://localhost:8001/caisse';
 constructor(private http : HttpClient) {
 }
 listeCaisse(): Observable<Caisse[]>{
 return this.http.get<Caisse[]>(this.apiURL);
 }
}