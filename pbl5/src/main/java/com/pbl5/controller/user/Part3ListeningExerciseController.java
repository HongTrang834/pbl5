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
import com.pbl5.model.Part3;
import com.pbl5.service.Part3Service;

@Controller
@RequestMapping("/user/part3-listening-exercise")
public class Part3ListeningExerciseController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminController.class);

	@Autowired
	private Part3Service part3Service;

	@RequestMapping("")
	public String list(Model model, RedirectAttributes redirectAttributes) {
		try {
			List<Part3> list = this.part3Service.findAll();

			// Kiểm tra nếu danh sách không rỗng thì lấy phần tử đầu tiên
			Part3 part3ListeningExercise = list.isEmpty() ? null : list.get(0);

			model.addAttribute("list", list);
			model.addAttribute("part3ListeningExercise", part3ListeningExercise);

		} catch (Exception e) {
			logger.error("Lỗi khi lấy danh sách bài luyện nghe phần 3: ", e);
			redirectAttributes.addFlashAttribute("errorMessage", "Có lỗi khi tải danh sách bài luyện nghe phần 3!");
		}

		return "user/part3-listening-exercise";
	}

	@RequestMapping("/{id}")
	public String list(Model model, @PathVariable("id") Long id, RedirectAttributes redirectAttributes) {

		try {
			List<Part3> list = this.part3Service.findAll();

			Part3 part3ListeningExercise = this.part3Service.findById(id);

			model.addAttribute("list", list);
			model.addAttribute("part3ListeningExercise", part3ListeningExercise);

		} catch (Exception e) {
			logger.error("Lỗi khi lấy danh sách bài luyện nghe phần 3: ", e);
			redirectAttributes.addFlashAttribute("errorMessage", "Có lỗi khi tải danh sách bài luyện nghe phần 3!");
		}

		return "user/part3-listening-exercise";
	}

}
