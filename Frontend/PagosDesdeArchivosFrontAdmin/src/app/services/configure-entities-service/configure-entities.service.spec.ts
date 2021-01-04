import { TestBed } from '@angular/core/testing';

import { ConfigureEntitiesService } from './configure-entities.service';

describe('ConfigureEntitiesService', () => {
  let service: ConfigureEntitiesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ConfigureEntitiesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
