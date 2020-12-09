import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UploadFileService {

  constructor(private http: HttpClient) { }

  uploadFile(formData){
    let urlAPI = 'http://localhost:8080/api/uploadFile';
    return this.http.post(urlAPI, formData);
  }
}
