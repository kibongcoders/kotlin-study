# Kotlin Introduce

## 코틀린 언어 발전
코틀린은 2010년에 처음 소개된 오픈 소스 프로그래밍 언어로, 제트브레인즈(JetBrains)와 다수의 오픈 소스 기여자들에 의해 유지 관리되고 있습니다. 현대 개발 트렌드에 맞춰 지속적으로 새로운 기능이 추가되고 있으며, 초기 10년 동안 안드레이 브레슬라브가 리드 디자이너로서 이끌다가, 2020년 11월부터 로만 엘리자로프가 새로운 리드 디자이너로 임명되었습니다.

## 언어 개발 과정에 기여하는 방법
코틀린의 발전 과정에 기여하고자 하는 사람들은 다음과 같은 옵션을 선택할 수 있습니다:
- 코틀린 발전 및 개선 과정(KEEP): 새로운 기능을 추가하기 위한 제안을 할 수 있는 프로세스로, 관련 GitHub 리포지토리에서 자세히 설명되어 있습니다.
- 기여: 오픈 소스 기여자로서 조기 접근 미리보기(EAP)에 참여하거나 다양한 라이브러리, 컴파일러, 코틀린 IDE 플러그인 개발에 기여할 수 있습니다.
교육 자료를 개발하거나 문서를 개선하고 튜토리얼 및 비디오를 만드는 방식으로 기여할 수 있습니다.
- 버그 수정: 버그를 발견하여 수정하고자 하는 경우, 공개된 코틀린 이슈 트래커를 통해 제안할 수 있습니다.
기존 기능을 제거하거나 변경하는 비호환적 변경 제안도 가능합니다. 제안 절차는 코틀린 재단 웹사이트에 설명되어 있습니다.
커뮤니티 참여:

다른 기여자들을 찾고 커뮤니티 토론에 참여하고 싶다면, Slack 커뮤니티의 #kontributors 채널에 참여할 수 있습니다.

## 실용적 진화 원칙
코틀린은 다음 세 가지 실용적 진화 원칙을 따릅니다:

- 오랜 기간 동안 현대성을 유지: 시간이 지남에 따라 기술이 낡아지기 때문에, 언어는 새로운 기능을 추가하는 것뿐만 아니라 오래된 기능을 단계적으로 폐지하여 진화해야 합니다.
- 사용자와 지속적인 피드백 루프 유지: 새로운 기능을 추가할 때는 사용자 피드백이 중요합니다. 프리 릴리즈 버전을 통해 사용자들이 업데이트를 테스트하고 피드백을 제공함으로써 언어 개선에 기여할 수 있습니다.
- 사용자에게 새로운 버전 업데이트를 편리하게 제공: 비호환적 변경으로 인해 사용자가 겪을 수 있는 문제를 최소화하기 위해, 컴파일 시간 경고, 폐지 메커니즘 및 자동 마이그레이션 도구를 통해 사용자들이 변경 사항에 대비할 수 있도록 합니다.

## 코틀린 릴리스
코틀린 업데이트는 두 가지 유형으로 나뉩니다:

- 기능(주요) 릴리스(1.x.0 또는 1.x):
새로운 기능을 추가하고 폐지된 기능을 변경하거나 제거하는 주요 업데이트입니다. 일반적으로 약 6개월마다 이루어지며, 하나 이상의 EAP 빌드를 통해 커뮤니티 피드백을 수집합니다.
- 증분(소규모) 릴리스(1.x.y, y는 10의 배수):

기능 릴리스 사이에 이루어지는 업데이트로, 표준 라이브러리 API 개선, 성능 개선, 버그 수정, 도구 업데이트 등을 포함합니다.
구성 요소의 안정성
안정적인 버전을 출시하기 전, 여러 사전 안정 버전이 출시되어 사용자들이 업데이트를 테스트하고 피드백을 제공할 수 있습니다. 안정성 수준은 다음과 같습니다:

- 실험적: 아이디어를 시도해보는 단계로, 사용자 피드백에 따라 언제든지 폐지될 수 있습니다. 장난감 프로젝트에서만 사용 권장합니다.
- 알파: 제품화 결정이 내려졌지만 최종 형태에 도달하지 않은 단계로, 마이그레이션 문제를 예상하고 사용해야 합니다.
- 베타: 거의 완성된 단계로, 변경이 가능하다는 신호입니다. 폐지 경고를 주의 깊게 살펴보고 사용할 수 있습니다.
- 안정적: 기능이 사용 준비가 되었음을 나타내며, 후방 호환성 규칙에 따라 진화합니다.

## 결론
코틀린 프로그래밍 언어 개발의 핵심 요소를 통해 언어의 변화 원칙과 버전 번호의 의미를 이해할 수 있습니다. 또한, 새로운 기능을 사용할 때 안정성 수준을 구분하여 올바른 결정을 내릴 수 있는 방법을 알게 되었습니다.