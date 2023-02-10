import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Secours } from '../model/secours.model';

@Injectable({
  providedIn: 'root'
})
export class SecoursService {

  apiURL: string = 'http://localhost:8001/secours';
  constructor(private http : HttpClient) {
  }
  
  
  listeSecours(): Observable<Secours[]>{
    return this.http.get<Secours[]>(this.apiURL);
}
}
