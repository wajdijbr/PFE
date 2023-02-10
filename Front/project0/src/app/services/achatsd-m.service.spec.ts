import { TestBed } from '@angular/core/testing';

import { AchatsdMService } from './achatsd-m.service';

describe('AchatsdMService', () => {
  let service: AchatsdMService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AchatsdMService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
