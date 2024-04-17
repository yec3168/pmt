import React, {useState} from "react";


function InputSample(){
    const [inputs, setInputs] = useState({
        name : '',
        nickname : '',
        email : '',
        passoword : '',
        address : '',
        phone: '',
        gender: '',
        filename: '',
        url : ''
    });

    const {name, nickname, email, password, address, phone, gender} = inputs;

    const onChange = (e) =>{
        console.log(e);

    }



    return (
        <form id="signupForm" action="@{/member/new}" method="post" role="form" enctype="multipart/form-data" >
            <table className="tb tb_col">
                <tbody>
                <tr>
                    <th>이름 <span className="es">필수 입력</span></th>
                    <td >
                        <input type="text" name="name" placeholder="이름을 입력해 주세요." />
                    </td>

                    <th >닉네임 <span className="es">필수 입력</span></th>
                    <td >
                        <input type="text" name="nickName" placeholder="닉네임을 입력해 주세요." />
                    </td>

                </tr>
                <tr>
                    <th>대표이미지</th>
                    <td>
                       <img />
                    </td>
                    <td colSpan="3">
                        <input name="userImg" type="file" className="form-control" />
                            <p>이미지는 나중에 수정할 수 있습니다. <br />jpg, jpeg, png파일을 넣어주세요.</p>
                    </td>
                </tr>
                <tr>
                    <th>이메일 <span className="es">필수 입력</span></th>
                    <td colspan="3">
                        <input type="text" name="email" placeholder="이메일을 입력해주세요." />
                            <button type="button" id="idCheckBtn" className="btns btn_st5" >중복 확인</button>
                    </td>
                </tr>

                <tr>
                    <th>비밀번호 <span className="es">필수 입력</span></th>
                    <td colSpan="3">
                        <input type="password" name="password" placeholder="비밀번호를 입력해주세요." />
                    </td>
                </tr>
                <tr>
                    <th scope="row">주소 <span className="es">필수 입력</span></th>
                    <td colSpan="3">
                        <input type="text" name="address" placeholder="주소를 입력해주세요."/>
                    </td>
                </tr>
                <tr>
                    <th scope="row">성별 <span class="es">필수 입력</span></th>
                    <td colSpan="3">
                        <div className="radio_group" name="gender">
                            <p className="radios">
                                <input type="radio" id="male" name="gender" value="MAN" checked />
                                <label form="male">남</label><span className="check"></span>
                            </p>
                            <p className="radios">
                                <input type="radio" id="female" name="gender" value="WOMAN" />
                                <label form="female">여</label><span className="check"></span>
                            </p>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
            <p class="btn_set">
                <button type="submit" className="btns btn_st2" >가입</button>
                <button type="button" className="btns btn_bdr2" onclick="closeSignupPopup();">취소</button>
            </p>
        </form>
    );

}

export default InputSample;