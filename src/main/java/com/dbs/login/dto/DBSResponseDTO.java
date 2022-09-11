package com.dbs.login.dto;

public class DBSResponseDTO {
	
	String message;
	Object data;
	boolean success;
	public DBSResponseDTO(String message, Object data, boolean success) {
		super();
		this.message = message;
		this.data = data;
		this.success = success;
	}
	public DBSResponseDTO(String message, boolean success) {
		super();
		this.message = message;
		//this.data = data;
		this.success = success;
	}
	public DBSResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DBSResponseDTO(Builder builder)
    {
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }
  
    // Static class Builder
    public static class Builder {
  
        /// instance fields
        private Object data;
        private String message;
        private Boolean success;
  
        public static Builder newInstance()
        {
            return new Builder();
        }
  
        private Builder() {}
  
        // Setter methods
        public Builder setMessage(String  message)
        {
            this.message = message;
            return this;
        }
        public Builder setData(Object data)
        {
            this.data = data;
            return this;
        }
        public Builder setSuccess(Boolean success)
        {
            this.success = success;
            return this;
        }
  
        // build method to deal with outer class
        // to return outer instance
        public DBSResponseDTO build()
        {
            return new DBSResponseDTO(this);
        }
    }
  
	
	
	
	

}
