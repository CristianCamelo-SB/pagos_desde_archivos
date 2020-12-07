import { Component, OnInit } from '@angular/core';

import { UploadFileService } from '../../services/upload-file-service/upload-file.service';

@Component({
  selector: 'app-upload-file',
  templateUrl: './upload-file.component.html',
  styleUrls: ['./upload-file.component.css']
})
export class UploadFileComponent implements OnInit {

  fileContent: string = '';
  uploadFiles: Array<File>;

  constructor(private uploadFileService: UploadFileService) { }

  ngOnInit(): void {
  }

  onUpload(){
    let formData = new FormData();
    for (let i = 0; i < this.uploadFiles.length; i++) {
      formData.append('uploads[]', this.uploadFiles[i], this.uploadFiles[i].name);
    }
    this.uploadFileService.uploadFile(formData).subscribe(res => {

    }, error => {
      
    });
  }

  onFileChange(e){
    this.uploadFiles = e.target.files;
  }

  public onChange(fileList: FileList): void {
    let file = fileList[0];
    let fileReader: FileReader = new FileReader();
    let self = this;

    fileReader.readAsText(file);
    fileReader.onloadend = function(x) {
      self.fileContent = fileReader.result.toString();
    }
    console.log('aqui');
    console.log(this.fileContent);
    let no = this.fileContent.split(' ');
    for (let i = 0; i < no.length; i++) {
      console.log(no[i]);
    }
  }

}
