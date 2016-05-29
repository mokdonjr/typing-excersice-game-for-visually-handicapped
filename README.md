# typing-excersice-game-for-visually-handicapped
객지2 미니프로젝트 정석, 승찬. typing-excersice-game-for-visually-handicapped

//작성일 2016-05-29
1. 프로젝트 : 시각장애인을 위한 타이핑 연습 프로그램(개발중)

2. 개발자 : 박정석, 백승찬

3. 사용 설명서 :

 - 외부 참조 파일 설명 :
	우리 프로그램이 불러오는 외부 참조 파일은 총 3가지이다 ('layer위.png', 'layer1.gif', 'words.txt')
	작업 시 작업프로젝트file에 작업package와 함께 copy해두었으며
	모두 경로명이 현 작업프로젝트 경로이다.

 - 외부 참조 파일 사용법 : 
	따라서, 사용자는 우리 프로그램을 이용 시
	프로그램이 있는 디렉터리에 위 3가지 참조하는 파일을 함께 지정해야 실행이 원활히 가능하다.

4. reference libraries : 
	우리는 이 프로그램에서 텍스트를 음성으로 읽어주는 기술이 필요했다.
	그리고 SunTextToSpeech java API를 발견했고 이를 적용해 개발에 도움을 받았다.
	아래는 FreeTTS에 대한 소개와 개발자 정보 이다.

-------------------------------------------------------------------------------------

 - Introduction
FreeTTS is a speech synthesis system written entirely in the JavaTM programming language. It is based upon Flite: a small run-time speech synthesis engine developed at Carnegie Mellon University. Flite is derived from the Festival Speech Synthesis System from the University of Edinburgh and the FestVox project from Carnegie Mellon University.

This release of FreeTTS includes:

Core speech synthesis engine
Support for a number of voices:
an 8khz diphone, male, US English voice
a 16khz diphone, male US English voice
a 16khz limited domain, male US English voice
Support for importing voices from FestVox (US English only)
Specific support for importing CMU ARCTIC voices from FestVox (US English only)
Support for MBROLA voices (downloaded separately):
a 16khz female, US English voice
two 16khz male US English voices
Partial support for JSAPI 1.0
Extensive API documentation
Several demo applications

 - Authors
FreeTTS was built by the Speech Integration Group of Sun Microsystems Laboratories:

Willie Walker, Manager and Principal Investigator
Paul Lamere, Staff Engineer
Philip Kwok, Member of Technical Staff
You can contact the Sun Microsystems Speech Integration Group through the FreeTTS Forums.

FreeTTS is based on CMU's Flite, written by:

Alan Black
Kevin Lenzo
Kevin and Alan generated the data used by FreeTTS. In addition, Kevin is the voice behind the diphone voices (kevin 8k, kevin 16k), and Alan is the voice behind the speaking clock.

Support for MBROLA voice output was contributed by Marc Schroder, text-to-speech Researcher in the Language Technology Lab at DFKI, Saarbrucken, Germany.

Support for importing FestVox voices into FreeTTS, and support for dynamically discovering and loading voices was developed by David Vos, a Sun Microsystems Laboratories student intern.
