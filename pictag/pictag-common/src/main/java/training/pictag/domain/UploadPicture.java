/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package training.pictag.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author User
 */
public class UploadPicture {
    private String id;
    private Date captureDate;
    private User owner;
    private String imageLocation;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(Date captureDate) {
        this.captureDate = captureDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
    
}
