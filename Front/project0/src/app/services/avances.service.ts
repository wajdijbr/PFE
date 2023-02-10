import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Avances } from '../model/avances.model';

@Injectable({
  providedIn: 'root'
})
export class AvancesService {

  apiURL: string = 'http://localhost:8001/avances';
  constructor(private http : HttpClient) {
  }
  
  
  listeAvances(): Observable<Avances[]>{
    return this.http.get<Avances[]>(this.apiURL);
}
}