package com.solvd.hospital.service;

import com.solvd.hospital.domain.Supplier;

public interface SupplierService {

    Supplier createOrGet(Supplier supplier);

    void delete(String name);

    void update(Supplier supplier, String country);

}
