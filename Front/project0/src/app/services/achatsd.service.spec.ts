import { TestBed } from '@angular/core/testing';

import { AchatsdService } from './achatsd.service';

describe('AchatsdService', () => {
  let service: AchatsdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AchatsdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
