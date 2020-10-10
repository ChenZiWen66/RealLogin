import md5 from 'js-md5'
function sayHello(password){
    return md5(password);
}
export default {
    sayHello
}