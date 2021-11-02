import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {CustomResponse} from "../interface/custom-response";

@Injectable({
  providedIn: 'root'
})
export class ServerService {
//1:22
  constructor(private http: HttpClient) { }





   servers$ =    this.http.get<CustomResponse>(`${this.apiUrl}/server/list`)


}
