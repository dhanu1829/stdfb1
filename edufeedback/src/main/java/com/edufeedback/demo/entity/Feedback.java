
package com.edufeedback.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_email")
    private String studentEmail;

    @Column(name = "email", nullable = false, length = 160)
    private String email;

    @Column(name = "register_number", nullable = false, length = 50)
    private String registerNumber;

    @Column(name = "department", nullable = false, length = 100)
    private String department;

    @Column(name = "faculty_name")
    private String facultyName;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "subject")
    private String subject;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "overall_rating")
    private Integer overallRating;

    @Column(name = "comments", length = 2000)
    private String comments;

    @Column(name = "academic_year")
    private String academicYear;

    @Column(name = "facilities_used", length = 500)
    private String facilitiesUsed;

    @Column(name = "teaching_effectiveness", length = 100)
    private String teachingEffectiveness;

    @Column(name = "recommend_course")
    private String recommendCourse;

    @Column(name = "feedback_date")
    private LocalDate feedbackDate;

    @Column(name = "submitted_at")
    private LocalDateTime submittedAt;

    public Feedback() {
    }

    @PrePersist
    protected void onCreate() {
        if (submittedAt == null) {
            submittedAt = LocalDateTime.now();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(Integer overallRating) {
        this.overallRating = overallRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getFacilitiesUsed() {
        return facilitiesUsed;
    }

    public void setFacilitiesUsed(String facilitiesUsed) {
        this.facilitiesUsed = facilitiesUsed;
    }

    public String getTeachingEffectiveness() {
        return teachingEffectiveness;
    }

    public void setTeachingEffectiveness(String teachingEffectiveness) {
        this.teachingEffectiveness = teachingEffectiveness;
    }

    public String getRecommendCourse() {
        return recommendCourse;
    }

    public void setRecommendCourse(String recommendCourse) {
        this.recommendCourse = recommendCourse;
    }

    public LocalDate getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(LocalDate feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}
