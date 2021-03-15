package com.example.countrylist.Activites.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VehicalListDtO {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("data")
    @Expose
    private List<Data> data;
    @SerializedName("message")
    @Expose
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public class Data {

        @SerializedName("vechile_id")
        @Expose
        private String vechile_id;
        @SerializedName("master_driver_id")
        @Expose
        private String master_driver_id;
        @SerializedName("shipping_type")
        @Expose
        private String shipping_type;
        @SerializedName("vehicle_category")
        @Expose
        private String vehicle_category;
        @SerializedName("vehicle_reg_no")
        @Expose
        private String vehicle_reg_no;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("dot_number")
        @Expose
        private String dot_number;

        @SerializedName("insurance_exp_date")
        @Expose
        private String insurance_exp_date;
        @SerializedName("vehicle_rc")
        @Expose
        private String vehicle_rc;
        @SerializedName("vehicle_image")
        @Expose
        private String vehicle_image;
        @SerializedName("vehicle_license")
        @Expose
        private String vehicle_license;

        @SerializedName("type_of_vehicle")
        @Expose
        private String type_of_vehicle;
        @SerializedName("vehicle_type")
        @Expose
        private String vehicle_type;

        @SerializedName("is_assign")
        @Expose
        private String is_assign;

        @SerializedName("sub_driver_id")
        @Expose
        private String sub_driver_id;

        @SerializedName("fname")
        @Expose
        private String fname;
        @SerializedName("lname")
        @Expose
        private String lname;

        @SerializedName("driver_name")
        @Expose
        private String driver_name;

        public String getDriver_name() {
            return driver_name;
        }

        public void setDriver_name(String driver_name) {
            this.driver_name = driver_name;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getIs_assign() {
            return is_assign;
        }

        public void setIs_assign(String is_assign) {
            this.is_assign = is_assign;
        }

        public String getSub_driver_id() {
            return sub_driver_id;
        }

        public void setSub_driver_id(String sub_driver_id) {
            this.sub_driver_id = sub_driver_id;
        }



        public String getVehicle_type() {
            return vehicle_type;
        }

        public void setVehicle_type(String vehicle_type) {
            this.vehicle_type = vehicle_type;
        }

        public String getType_of_vehicle() {
            return type_of_vehicle;
        }

        public void setType_of_vehicle(String type_of_vehicle) {
            this.type_of_vehicle = type_of_vehicle;
        }

        public String getVechile_id() {
            return vechile_id;
        }

        public void setVechile_id(String vechile_id) {
            this.vechile_id = vechile_id;
        }

        public String getMaster_driver_id() {
            return master_driver_id;
        }

        public void setMaster_driver_id(String master_driver_id) {
            this.master_driver_id = master_driver_id;
        }

        public String getShipping_type() {
            return shipping_type;
        }

        public void setShipping_type(String shipping_type) {
            this.shipping_type = shipping_type;
        }

        public String getVehicle_category() {
            return vehicle_category;
        }

        public void setVehicle_category(String vehicle_category) {
            this.vehicle_category = vehicle_category;
        }

        public String getVehicle_reg_no() {
            return vehicle_reg_no;
        }

        public void setVehicle_reg_no(String vehicle_reg_no) {
            this.vehicle_reg_no = vehicle_reg_no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDot_number() {
            return dot_number;
        }

        public void setDot_number(String dot_number) {
            this.dot_number = dot_number;
        }

        public String getInsurance_exp_date() {
            return insurance_exp_date;
        }

        public void setInsurance_exp_date(String insurance_exp_date) {
            this.insurance_exp_date = insurance_exp_date;
        }

        public String getVehicle_rc() {
            return vehicle_rc;
        }

        public void setVehicle_rc(String vehicle_rc) {
            this.vehicle_rc = vehicle_rc;
        }

        public String getVehicle_image() {
            return vehicle_image;
        }

        public void setVehicle_image(String vehicle_image) {
            this.vehicle_image = vehicle_image;
        }

        public String getVehicle_license() {
            return vehicle_license;
        }

        public void setVehicle_license(String vehicle_license) {
            this.vehicle_license = vehicle_license;
        }
    }

}
