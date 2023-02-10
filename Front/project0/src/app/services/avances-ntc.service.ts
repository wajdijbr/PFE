import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AvancesNtc } from '../model/avances-ntc.model';

@Injectable({
  providedIn: 'root'
})
export class AvancesNtcService {

  apiURL: string = 'http://localhost:8001/avances/';
 
  constructor(private http : HttpClient) {
 }
 
 
 listeAvancesNtc(ntc: String): Observable<AvancesNtc[]>{
   return this.http.get<AvancesNtc[]>(this.apiURL+ntc);
  
  
   }
 
}
