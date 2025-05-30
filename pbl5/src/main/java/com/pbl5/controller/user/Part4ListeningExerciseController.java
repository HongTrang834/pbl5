package com.pbl5.controller.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pbl5.controller.admin.UserAdminController;
import com.pbl5.model.Part4;
import com.pbl5.service.Part4Service;

@Controller
@RequestMapping("/user/part4-listening-exercise")
public class Part4ListeningExerciseController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminController.class);

	@Autowired
	private Part4Service part4Service;

	@RequestMapping("")
	public String list(Model model, RedirectAttributes redirectAttributes) {
		try {
			List<Part4> list = this.part4Service.findAll();

			// Kiểm tra nếu danh sách không rỗng thì lấy phần tử đầu tiên
			Part4 part4ListeningExercise = list.isEmpty() ? null : list.get(0);

			model.addAttribute("list", list);
			model.addAttribute("part4ListeningExercise", part4ListeningExercise);

		} catch (Exception e) {
			logger.error("Lỗi khi lấy danh sách bài luyện nghe phần 4: ", e);
			redirectAttributes.addFlashAttribute("errorMessage", "Có lỗi khi tải danh sách bài luyện nghe phần 4!");
		}

		return "user/part4-listening-exercise";
	}

	@RequestMapping("/{id}")
	public String list(Model model, @PathVariable("id") Long id, RedirectAttributes redirectAttributes) {

		try {
			List<Part4> list = this.part4Service.findAll();

			Part4 part4ListeningExercise = this.part4Service.findById(id);

			model.addAttribute("list", list);
			model.addAttribute("part4ListeningExercise", part4ListeningExercise);

		} catch (Exception e) {
			logger.error("Lỗi khi lấy danh sách bài luyện nghe phần 4: ", e);
			redirectAttributes.addFlashAttribute("errorMessage", "Có lỗi khi tải danh sách bài luyện nghe phần 4!");
		}

		return "user/part4-listening-exercise";
	}

}
