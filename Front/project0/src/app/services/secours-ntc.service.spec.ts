import { TestBed } from '@angular/core/testing';

import { SecoursNtcService } from './secours-ntc.service';

describe('SecoursNtcService', () => {
  let service: SecoursNtcService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SecoursNtcService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
