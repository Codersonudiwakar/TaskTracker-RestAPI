package com.tasktracker.test.exception;

public class ResourceNotFoundException extends RuntimeException{


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String message;

		public ResourceNotFoundException (String message)
		{
			super(message);
			this.message = message;
		}
	}

