import { TestBed } from '@angular/core/testing';

import { SecoursService } from './secours.service';

describe('SecoursService', () => {
  let service: SecoursService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SecoursService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
