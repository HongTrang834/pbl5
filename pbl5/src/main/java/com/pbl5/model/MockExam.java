package com.pbl5.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "mock_exam")
public class MockExam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "mock_exam_name", nullable = false, length = 255)
	private String mockExamName;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part1> part1s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part2> part2s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part3> part3s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part4> part4s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part5> part5s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part6> part6s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Part7> part7s;
	
	@OneToMany(mappedBy = "mockExam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TestResult> testResults;

	public MockExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MockExam(Long id, String mockExamName, List<Part1> part1s, List<Part2> part2s, List<Part3> part3s,
			List<Part4> part4s, List<Part5> part5s, List<Part6> part6s, List<Part7> part7s,
			List<TestResult> testResults) {
		super();
		this.id = id;
		this.mockExamName = mockExamName;
		this.part1s = part1s;
		this.part2s = part2s;
		this.part3s = part3s;
		this.part4s = part4s;
		this.part5s = part5s;
		this.part6s = part6s;
		this.part7s = part7s;
		this.testResults = testResults;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMockExamName() {
		return mockExamName;
	}

	public void setMockExamName(String mockExamName) {
		this.mockExamName = mockExamName;
	}

	public List<Part1> getPart1s() {
		return part1s;
	}

	public void setPart1s(List<Part1> part1s) {
		this.part1s = part1s;
	}

	public List<Part2> getPart2s() {
		return part2s;
	}

	public void setPart2s(List<Part2> part2s) {
		this.part2s = part2s;
	}

	public List<Part3> getPart3s() {
		return part3s;
	}

	public void setPart3s(List<Part3> part3s) {
		this.part3s = part3s;
	}

	public List<Part4> getPart4s() {
		return part4s;
	}

	public void setPart4s(List<Part4> part4s) {
		this.part4s = part4s;
	}

	public List<Part5> getPart5s() {
		return part5s;
	}

	public void setPart5s(List<Part5> part5s) {
		this.part5s = part5s;
	}

	public List<Part6> getPart6s() {
		return part6s;
	}

	public void setPart6s(List<Part6> part6s) {
		this.part6s = part6s;
	}

	public List<Part7> getPart7s() {
		return part7s;
	}

	public void setPart7s(List<Part7> part7s) {
		this.part7s = part7s;
	}

	public List<TestResult> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}
	
}
