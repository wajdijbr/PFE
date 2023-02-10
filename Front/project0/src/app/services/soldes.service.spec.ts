import { TestBed } from '@angular/core/testing';

import { SoldesService } from './soldes.service';

describe('SoldesService', () => {
  let service: SoldesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SoldesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
