package com.study.springboot;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContentDTO {
	private int id;
	@NotNull(message = "글써라글글글")
	@NotEmpty(message = "빈공간빈공간")
	@Size(min = 2, message = "writer 최소 두자, 최대 열자")
	private String writer;
	@NotNull(message = "글글글써")
	@NotEmpty(message = "공공공간빙")
	@Size(min = 2, message = "content 짧다길다")
	private String content;
}
