package com.example.mainmap;

public class ReviewComponent {
    //술 이름, 리뷰내용, 별점
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String drink_name;
    String review_content;
    String area;
    float rating_value;

    //생성자 메소드
    public ReviewComponent() {}

    public ReviewComponent(String drink_name, String review_content, float rating_value, String email, String area) {
        this.drink_name = drink_name;
        this.review_content = review_content;
        this.rating_value = rating_value;
        this.email=email;
        this.area = area;
    }

    public String getDrink_name() {
        return drink_name;
    }
    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    public String getReview_content() {
        return review_content;
    }
    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }

    public float getRating_value() {
        return rating_value;
    }
    public void setRating_value(float rating_value) {
        this.rating_value = rating_value;
    }

    public String getArea() {return area;}
    public void setArea(String area) {this.area = area;}
}