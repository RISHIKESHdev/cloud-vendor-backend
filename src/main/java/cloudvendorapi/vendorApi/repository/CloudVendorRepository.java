package cloudvendorapi.vendorApi.repository;

import cloudvendorapi.vendorApi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{
        }
