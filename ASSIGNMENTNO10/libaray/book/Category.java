package com.libaray.book;


public enum Category {
	STORY(){
		@Override
		public String toString() {
			return "Story";
		}
	}, NOVEL(){
		@Override
		public String toString() {
			return "Novel";
		}
	}, COMICS(){
		@Override
		public String toString() {
			return "Comics";
		}
	}, ROMANCE(){
		@Override
		public String toString() {
			return "Rommace";
		}
	}, ACTIONS(){
		@Override
		public String toString() {
			return "Action";
		}
	}
}