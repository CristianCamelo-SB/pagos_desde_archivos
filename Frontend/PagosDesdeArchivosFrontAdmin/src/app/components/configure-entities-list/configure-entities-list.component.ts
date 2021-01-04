import { Component, OnInit } from '@angular/core';

import { ConfigureEntitiesService } from '../../services/configure-entities-service/configure-entities.service'
import { CollectingEntity } from '../../models/CollectingEntity';

@Component({
  selector: 'app-configure-entities-list',
  templateUrl: './configure-entities-list.component.html',
  styleUrls: ['./configure-entities-list.component.css']
})
export class ConfigureEntitiesListComponent implements OnInit {
  entities: CollectingEntity[];

  constructor(private service: ConfigureEntitiesService) { }

  ngOnInit(): void {
    this.service.getEntities().subscribe((res: CollectingEntity[]) => {
      this.entities = res;
      console.log(res);
    }, err => {
      console.log(err);
    });
  }

}
