import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { CollectingEntity } from 'src/app/models/CollectingEntity';
import { ConfigureEntitiesService } from 'src/app/services/configure-entities-service/configure-entities.service';

@Component({
  selector: 'app-configure-entities-form',
  templateUrl: './configure-entities-form.component.html',
  styleUrls: ['./configure-entities-form.component.css']
})
export class ConfigureEntitiesFormComponent implements OnInit {

  changeInfo: boolean = true;
  entity: CollectingEntity = {
                              id: 0,
                              nit: '',
                              name: '',
                              address: ''
                            };
  
  constructor(private activedRoute: ActivatedRoute, private service: ConfigureEntitiesService) { }

  ngOnInit(): void {
    const params = this.activedRoute.snapshot.params;
    if (params.id) {
      this.service.getEntityById(params.id).subscribe((res: CollectingEntity) => {
        this.entity = res;
      }, err => {
        console.log(err);
      });
      if (this.activedRoute.snapshot.url[1].path != 'edit') {
        this.changeInfo = false;
      }
    }
  }

}
