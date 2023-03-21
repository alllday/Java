function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) { //==
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교(){
	n1 = 100
	n2 = 200
	
	if (n1 == n2) {
		alert("같음")
	} else {
		alert("다름")
	}
	
	mood1 = prompt("내 기분")
	mood2 = prompt("네 기분")
	
	if (mood1 == mood2) {
		alert('같음')
	} else {
		alert('다름')
	}
}