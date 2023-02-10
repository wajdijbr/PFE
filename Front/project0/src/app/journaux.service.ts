import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Journaux } from './model/journaux.model';
const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
  };
  @Injectable({
    providedIn: 'root'
  })  

export class JournauxService {
  
 journal! : Journaux[];
apiURL: string = 'http://localhost:8001/journaux';
 constructor(private http : HttpClient) {
 }
 listeJournaux(): Observable<Journaux[]>{
 return this.http.get<Journaux[]>(this.apiURL);
 }
}