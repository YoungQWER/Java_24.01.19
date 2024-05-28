
public class test {

	
	
	struct person {
	    char name[7], gender[3];
	    int age;
	};

	int main() {
	    int i;
	    struct person user[N] = { {"김유정","여"}, {"김영직","남"}, {"김윤정","여"}, {"김시아","여"}, {"김동욱","남"} };

	    // 사용자로부터 각 사람의 나이를 입력 받음
	    for (i = 0; i < N; i++) {
	        printf("%s의 나이는?", user[i].name);
	        scanf("%d", &(user[i].age));
	    }

	    printf("\n 이름\t 성별\t 나이\n");
	    printf("=======================\n");

	    // user 배열에 저장된 정보를 출력
	    for (i = 0; i < N; i++) {
	        printf("%s\t %s\t %d\n", user[i].name, user[i].gender, user[i].age);
	    }

	    printf("=======================\n");

	    return 0;
	}
	   
	   
	}
}
