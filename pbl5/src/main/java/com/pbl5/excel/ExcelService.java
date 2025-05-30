package com.pbl5.excel;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.multipart.MultipartFile;

import com.pbl5.model.GrammarLesson;
import com.pbl5.model.ListeningExercise;
import com.pbl5.model.MockExam;
import com.pbl5.model.Part1;
import com.pbl5.model.Part2;
import com.pbl5.model.Part3;
import com.pbl5.model.Part3Question;
import com.pbl5.model.Part4;
import com.pbl5.model.Part4Question;
import com.pbl5.model.Part5;
import com.pbl5.model.Part6;
import com.pbl5.model.Part6Question;
import com.pbl5.model.Part7;
import com.pbl5.model.Part7Question;
import com.pbl5.model.ReadingExercise;
import com.pbl5.model.VocabularyLesson;
import com.pbl5.model.VocabularyLessonContent;

public interface ExcelService {

	public List<VocabularyLessonContent> readVocabularyLessonContentExcelFile(MultipartFile file,
			VocabularyLesson vocabularyLesson, String myCode);

	public void saveVocabularyLessonContentFromExcel(MultipartFile file, VocabularyLesson vocabularyLesson,
			String myCode);

	public List<Part1> readPart1ListeningExerciseExcelFile(MultipartFile file, ListeningExercise listeningExercise,
			String myCode);

	public void savePart1ListeningExerciseFromExcel(MultipartFile file, ListeningExercise listeningExercise,
			String myCode);

	public List<Part2> readPart2ListeningExerciseExcelFile(MultipartFile file, ListeningExercise listeningExercise,
			String myCode);

	public void savePart2ListeningExerciseFromExcel(MultipartFile file, ListeningExercise listeningExercise,
			String myCode);

	public List<Part3Question> readPart3ListeningExerciseExcelFile(MultipartFile file,
			ListeningExercise listeningExercise, Part3 part3, String myCode);

	public void savePart3ListeningExerciseFromExcel(MultipartFile file, ListeningExercise listeningExercise,
			Part3 part3, String myCode);

	public List<Part4Question> readPart4ListeningExerciseExcelFile(MultipartFile file,
			ListeningExercise listeningExercise, Part4 part4, String myCode);

	public void savePart4ListeningExerciseFromExcel(MultipartFile file, ListeningExercise listeningExercise,
			Part4 part4, String myCode);

	public List<Part5> readPart5ReadingExerciseExcelFile(MultipartFile file, ReadingExercise readingExercise);

	public void savePart5ReadingExerciseFromExcel(MultipartFile file, ReadingExercise readingExercise);

	public List<Part6Question> readPart6ReadingExerciseExcelFile(MultipartFile file, Part6 part6);

	public void savePart6ReadingExerciseFromExcel(MultipartFile file, Part6 part6);

	public List<Part7Question> readPart7ReadingExerciseExcelFile(MultipartFile file, Part7 part7);

	public void savePart7ReadingExerciseFromExcel(MultipartFile file, Part7 part7);

	public List<Part5> readPart5GrammarLessonExcelFile(MultipartFile file, GrammarLesson grammarLesson);

	public void savePart5GrammarLessonFromExcel(MultipartFile file, GrammarLesson grammarLesson);

	// ============= Quản lý bài thi thử - Start =============

	public List<Part1> readPart1MockExamExcelFile(MultipartFile file, MockExam mockExam, String myCode,
			AtomicLong number);

	public void savePart1MockExamFromExcel(MultipartFile file, MockExam mockExam, String myCode, AtomicLong number);

	public List<Part2> readPart2MockExamExcelFile(MultipartFile file, MockExam mockExam, String myCode,
			AtomicLong number);

	public void savePart2MockExamFromExcel(MultipartFile file, MockExam mockExam, String myCode, AtomicLong number);

	public List<Part3Question> readPart3MockExamExcelFile(MultipartFile file, MockExam mockExam, String myCode,
			AtomicLong number);

	public void savePart3MockExamFromExcel(MultipartFile file, MockExam mockExam, String myCode, AtomicLong number);

	public List<Part4Question> readPart4MockExamExcelFile(MultipartFile file, MockExam mockExam, String myCode,
			AtomicLong number);

	public void savePart4MockExamFromExcel(MultipartFile file, MockExam mockExam, String myCode, AtomicLong number);

	public List<Part5> readPart5MockExamExcelFile(MultipartFile file, MockExam mockExam, AtomicLong number);

	public void savePart5MockExamFromExcel(MultipartFile file, MockExam mockExam, AtomicLong number);

	public List<Part6Question> readPart6MockExamExcelFile(MultipartFile file, MockExam mockExam, AtomicLong number);

	public void savePart6MockExamFromExcel(MultipartFile file, MockExam mockExam, AtomicLong number);

	public List<Part7Question> readPart7MockExamExcelFile(MultipartFile file, MockExam mockExam, AtomicLong number);

	public void savePart7MockExamFromExcel(MultipartFile file, MockExam mockExam, AtomicLong number);

	// ============= Quản lý bài thi thử - End ===============

}
