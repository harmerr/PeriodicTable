import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Element } from './element.model';

@Injectable({
  providedIn: 'root'
})
export class ElementService {

  readonly baseApiUrl = "http://localhost:8080/elements"
  
  constructor(private http : HttpClient) { }

  getElementByNum(atomicNum : number) : Observable<Element> {
    return this.http.get<Element>(this.baseApiUrl + "/" + atomicNum)
  }
  
}
