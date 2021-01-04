import { Injectable } from '@angular/core';
import { HttpClient }from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommissionReportService {
  urlAPI = 'http://localhost:8080/api/generateReport';

  constructor(private http: HttpClient) { }

  getReports(){
    return this.http.get(this.urlAPI + 's');
  }

  getReportById(id: string){
    return this.http.get(this.urlAPI + `?id=${id}`);
  }
}
