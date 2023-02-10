import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Achatsd } from '../model/achatsd.model';
import { AchatsdM } from '../consulter/achatsd/achatsd-m.model';
const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
  };
  @Injectable({
    providedIn: 'root'
  })  

export class AchatsdService {
 
 achatsd! : Achatsd[];
 achatsdM!:AchatsdM[];
/*apiURL: string = 'http://localhost:6001/achatsd';
constructor(private http : HttpClient) {
}
 listeAchatsd(): Observable<Achatsd[]>{
 return this.http.get<Achatsd[]>(this.apiURL);
 }*/

 apiURL: string = 'http://localhost:8001/achatsd';
constructor(private http : HttpClient) {
}


listeAchatsd(): Observable<Achatsd[]>{
  return this.http.get<Achatsd[]>(this.apiURL);
 
 
  }


 
  }

 



