import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private baseUrl = 'http://localhost:8080/api/logs/${apiName}';

  constructor(private http: HttpClient) {}

  // getLogs(apiName: string): Observable<any> {
  //   return this.http.get(
  //     `http://localhost:8080/api/logs/${encodeURIComponent(apiName)}`);
   
  // }
  getLogs() {
    return this.http.get<any[]>(`http://localhost:8080/api/logs/logs`);
  }
}