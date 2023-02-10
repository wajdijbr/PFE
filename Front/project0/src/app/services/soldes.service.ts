import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Soldes } from '../model/soldes.model';
const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
  };
  @Injectable({
    providedIn: 'root'
  })  

export class SoldesService {

 soldes! : Soldes[];
apiURL: string = 'http://localhost:8001/soldes';
constructor(private http : HttpClient) {
}
 listeSoldes(): Observable<Soldes[]>{
 return this.http.get<Soldes[]>(this.apiURL);
 }
 
}