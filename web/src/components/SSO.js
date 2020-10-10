import md5 from 'js-md5'
function transform2md5(password){
    return md5(password);
}
export default {
    transform2md5
}