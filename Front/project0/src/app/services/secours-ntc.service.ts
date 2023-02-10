import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SecoursNtc } from '../model/secours-ntc.model';

@Injectable({
  providedIn: 'root'
})
export class SecoursNtcService {
  apiURL: string = 'http://localhost:8001/secours/';
 
  constructor(private http : HttpClient) {
 }
 
 
 listeSecoursNtc(ntc: String): Observable<SecoursNtc[]>{
   return this.http.get<SecoursNtc[]>(this.apiURL+ntc);
  
  
   }
 
}
