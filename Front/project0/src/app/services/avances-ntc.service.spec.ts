import { TestBed } from '@angular/core/testing';

import { AvancesNtcService } from './avances-ntc.service';

describe('AvancesNtcService', () => {
  let service: AvancesNtcService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AvancesNtcService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
