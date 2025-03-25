package com.example.demo.controller;

import com.example.demo.model.cloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    // GET endpoint to fetch vendor details
    @GetMapping("/{vendorId}")
    public cloudVendor getVendorDetails(@PathVariable String vendorId) {
        return new cloudVendor(
                vendorId,
                "Amazon Web Services",
                "123 Cloud Street, Seattle",
                "1-800-123-4567"
        );
    }

    // POST endpoint to create new vendor
    @PostMapping("/")
    public String createVendorDetails(@RequestBody cloudVendor vendor) {
        // In a real application, you would save the vendor to a database here
        return "Vendor created successfully with ID: " + vendor.getVendorId();
    }
}



